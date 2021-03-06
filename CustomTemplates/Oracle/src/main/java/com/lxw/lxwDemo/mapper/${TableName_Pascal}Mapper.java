package ${PackageName}.mapper;

import ${PackageName}.pojo.${TableName_Pascal};

import java.util.List;
import java.util.Map;

/**
 * ${TableName_Pascal}Mapper
 * ${Author}
 * ${Date}
 */
public interface ${TableName_Pascal}Mapper {
    /**
     * 全字段插入
     */
    int insert(${TableName_Pascal} record);

    /**
     * 对非空字段插入
     */
    int insertSelective(${TableName_Pascal} record);

    /**
     * 对非空字段更新
     */
    int updateByPrimaryKeySelective(${TableName_Pascal} record);

    /**
     * 全字段更新
     */
    int updateByPrimaryKey(${TableName_Pascal} record);

    /**
     * 通过主键字段删除
     */
    int deleteByPrimaryKey(${PKColumnType} ${PKColumnName});

    /**
     * 通过主键字段查询
     */
    ${TableName_Pascal} selectByPrimaryKey(${PKColumnType} ${PKColumnName});

    /**
     * 获取序列值
     */
    Long getNextVal();

    /**
     * 获取数据
     */
    List<${TableName_Pascal}> selectAllByMap(Map map);
}
