package com.itheima.springboot_09_ssm.dao;

import com.itheima.springboot_09_ssm.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    @Insert("insert into tbl_book (type, name, description) values(#{type}, #{name}, #{description})")
    public int save(Book book);

    @Update("insert into tbl_book (type, name, description) values(#{type}, #{name}, #{description}) where id = #{id}")
    public int update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
