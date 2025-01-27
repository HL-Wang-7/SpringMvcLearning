package com.HL.service;

import com.HL.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface BookService {
    /**
     * 保存
     * @param book
     * @return boolean
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return boolean
     */
    public boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return boolean
     */
    public boolean delete(Integer id);

    /**
     * 根据id获取
     * @param id
     * @return Book
     */
    public Book getById(Integer id);
    /**
     * 获取所有
     * @return List<Book>
     */
    public List<Book> getAll();
}
