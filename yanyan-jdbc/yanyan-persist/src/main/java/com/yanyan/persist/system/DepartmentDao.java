package com.yanyan.persist.system;

import com.yanyan.data.domain.system.Department;
import com.yanyan.core.lang.Page;
import com.yanyan.data.domain.system.vo.StaffVo;
import com.yanyan.persist.TreeDao;
import com.yanyan.data.query.system.DepartmentQuery;

import java.util.List;

/**
 * 部门
 * User: Saintcy
 * Date: 2015/8/24
 * Time: 17:33
 */
public interface DepartmentDao extends TreeDao {

    void insertDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(Long dept_id);

    Department getDepartment(Long dept_id);

    Page<Department> findDepartment(DepartmentQuery query);

    void insertManager(Long dept_id, Long staff_id);

    void clearManagers(Long dept_id);

    List<StaffVo> getManagers(Long dept_id);
}