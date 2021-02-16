package ${PackageName}.mapper;

import ${PackageName}.pojo.${Table_Name_Pascal};

import java.util.List;
import java.util.Map;

/**
 * ${Table_Name_Pascal}Mapper
 * ${Author}
 * ${Date}
 */
public interface ${Table_Name_Pascal}Mapper {
    /**
     * 全字段插入
     */
    int insert(${Table_Name_Pascal} record);

    /**
     * 对非空字段插入
     */
    int insertSelective(${Table_Name_Pascal} record);

    /**
     * 对非空字段更新
     */
    int updateByPrimaryKeySelective(${Table_Name_Pascal} record);

    /**
     * 全字段更新
     */
    int updateByPrimaryKey(${Table_Name_Pascal} record);

    /**
     * 通过主键字段删除
     */
    int deleteByPrimaryKey(${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name});

    /**
     * 通过主键字段查询
     */
    ${Table_Name_Pascal} selectByPrimaryKey(${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name});

    /**
     * 获取序列值
     */
    Long getNextVal();

    /**
     * 获取数据
     */
    List<${Table_Name_Pascal}> selectAllByMap(Map map);
}
