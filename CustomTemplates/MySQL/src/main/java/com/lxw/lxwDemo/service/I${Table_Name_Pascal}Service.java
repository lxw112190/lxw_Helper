package ${PackageName}.service;

import ${PackageName}.pojo.${Table_Name_Pascal};
import com.github.pagehelper.PageInfo;

import java.util.Map;
import java.util.List;

 /**
 * ${Table_Name_Pascal}Service
 * ${Author}
 * ${Date}
 */
public interface I${Table_Name_Pascal}Service {

    /**
     * 新增
     */
    void add(${Table_Name_Pascal} record) throws Exception;

    /**
     * 修改
     */
    void update(${Table_Name_Pascal} record) throws Exception;

    /**
     * 删除
     */
    void delete(${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name}) throws Exception;

    /**
     * 获取分页数据
     */
    PageInfo getList(Map map) throws Exception;

    /**
     * 获取序列值
     */
    Long getNextVal() throws Exception;

    /**
     * 获取列表数据
     */
    List<${Table_Name_Pascal}> selectAll(Map map) throws Exception;

    /**
     * 获取实体
     */
    ${Table_Name_Pascal} getModel(${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name}) throws Exception;

}
