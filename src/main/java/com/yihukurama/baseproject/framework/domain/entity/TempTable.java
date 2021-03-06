package com.yihukurama.baseproject.framework.domain.entity;

public class TempTable extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column temp_table.id
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column temp_table.account
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column temp_table.password
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column temp_table.id
     *
     * @return the value of temp_table.id
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column temp_table.id
     *
     * @param id the value for temp_table.id
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column temp_table.account
     *
     * @return the value of temp_table.account
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column temp_table.account
     *
     * @param account the value for temp_table.account
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column temp_table.password
     *
     * @return the value of temp_table.password
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column temp_table.password
     *
     * @param password the value for temp_table.password
     *
     * @mbggenerated Wed Oct 05 12:58:57 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}