package com.app.market.dao.mapper.im.mybatis;

import com.app.market.dao.entity.im.mybatis.ImProductInfo;
import com.app.market.dao.entity.im.mybatis.ImProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImProductInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int countByExample(ImProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int deleteByExample(ImProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int insert(ImProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int insertSelective(ImProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    List<ImProductInfo> selectByExample(ImProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    ImProductInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int updateByExampleSelective(@Param("record") ImProductInfo record, @Param("example") ImProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int updateByExample(@Param("record") ImProductInfo record, @Param("example") ImProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int updateByPrimaryKeySelective(ImProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table im_product_info
     *
     * @mbggenerated Wed Mar 01 17:10:45 CST 2017
     */
    int updateByPrimaryKey(ImProductInfo record);
}