package ${PackageName}.service.impl;

import ${PackageName}.mapper.${TableName_Pascal}Mapper;
import ${PackageName}.pojo.${TableName_Pascal};
import ${PackageName}.service.I${TableName_Pascal}Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

 /**
 * ${TableName_Pascal}ServiceImpl
 * ${Author}
 * ${Date}
 */
@Service
public class ${TableName_Pascal}ServiceImpl implements I${TableName_Pascal}Service {

    @Autowired
    private ${TableName_Pascal}Mapper ${TableName_Pascal_FirstLetterToLower}Mapper;


    /**
     * 获取序列值
     */
    @Override
    public Long getNextVal() throws Exception {
        return ${TableName_Pascal_FirstLetterToLower}Mapper.getNextVal();
    }

    /**
     * 新增
     */
    @Override
    public void add(${TableName_Pascal} record) throws Exception {
        ${TableName_Pascal_FirstLetterToLower}Mapper.insertSelective(record);
    }

    /**
     * 修改
     */
    @Override
    public void update(${TableName_Pascal} record) throws Exception {
        ${TableName_Pascal_FirstLetterToLower}Mapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 删除
     */
    @Override
    public void delete(${PKColumnType} ${PKColumnName}) throws Exception {
        ${TableName_Pascal_FirstLetterToLower}Mapper.deleteByPrimaryKey(${PKColumnName});
    }

    /**
     * 获取实体
     */
    @Override
    public ${TableName_Pascal} getModel(${PKColumnType} ${PKColumnName}) throws Exception {
        return ${TableName_Pascal_FirstLetterToLower}Mapper.selectByPrimaryKey(${PKColumnName});
    }

    /**
     * 获取列表
     */
    @Override
    public List<${TableName_Pascal}> selectAll(Map map) throws Exception {
        return ${TableName_Pascal_FirstLetterToLower}Mapper.selectAllByMap(map);
    }

    /**
     * 获取分页数据
     */
    @Override
    public PageInfo getList(Map map) throws Exception {
        int pageNum = 1;
        int pageSize = 10;
        if (!StringUtils.isEmpty(map.get("page"))) {
            pageNum = Integer.parseInt((String) map.get("page"));
        }
        if (!StringUtils.isEmpty(map.get("limit"))) {
            pageSize = Integer.parseInt((String) map.get("limit"));
        }
        PageHelper.startPage(pageNum, pageSize);
        List<${TableName_Pascal}> list = ${TableName_Pascal_FirstLetterToLower}Mapper.selectAllByMap(map);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
