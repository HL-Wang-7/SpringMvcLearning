package com.HL.dao;

import com.HL.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

// dao层就是Mapper层
// 增删改查功能
@Mapper
public interface BookDao {
    @Insert("insert into tb_book (type, name, description) values(#{type}, #{name}, #{description})")
    public void save(Book book);

    @Update("update tb_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    @Delete("delete from tb_book where id = #{id}")
    public void delete(Integer id);

    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tb_book")
    public List<Book> getAll();
}
