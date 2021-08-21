package org.lili.mybatis.mapper;

import org.apache.ibatis.annotations.Select;
import org.lili.mybatis.domain.Person;

/**
 * @author lili
 * @date 2021/8/21 14:42
 */
public interface PersonMapper {
    //@Select("SELECT * FROM person WHERE id = #{id}")
    Person selectById(int id);
}