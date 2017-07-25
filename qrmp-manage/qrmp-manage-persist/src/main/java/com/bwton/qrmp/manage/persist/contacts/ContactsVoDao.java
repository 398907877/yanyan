package com.bwton.qrmp.manage.persist.contacts;


import org.apache.ibatis.annotations.Param;

import com.bwton.qrmp.manage.vo.contacts.ContactsVo;
import com.bwton.qrmp.manage.vo.contacts.ContactsVoExample;
import com.yanyan.core.lang.Page;

public interface ContactsVoDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table g_operator_contacts
     *
     * @mbg.generated
     */
    long countByExample(ContactsVoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table g_operator_contacts
     *
     * @mbg.generated
     * 
     * 
     */
    int deleteByExample(ContactsVoExample example);  

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table g_operator_contacts
     *
     * @mbg.generated
     */
    int insert(ContactsVo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table g_operator_contacts
     *
     * @mbg.generated
     */
    int insertSelective(ContactsVo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table g_operator_contacts
     *
     * @mbg.generated
     */
    Page<ContactsVo> selectByExample(ContactsVoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table g_operator_contacts
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ContactsVo record, @Param("example") ContactsVoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table g_operator_contacts
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ContactsVo record, @Param("example") ContactsVoExample example);
}