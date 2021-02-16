package ${PackageName}.service.impl;

import ${PackageName}.mapper.${Table_Name_Pascal}Mapper;
import ${PackageName}.pojo.${Table_Name_Pascal};
import ${PackageName}.service.I${Table_Name_Pascal}Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

 /**
 * ${Table_Name_Pascal}ServiceImpl
 * ${Author}
 * ${Date}
 */
@Service
public class ${Table_Name_Pascal}ServiceImpl implements I${Table_Name_Pascal}Service {

    @Autowired
    private ${Table_Name_Pascal}Mapper ${Table_Name_Pascal_FirstLetterToLower}Mapper;


    /**
     * 获取序列值
     */
    @Override
    public Long getNextVal() throws Exception {
        return ${Table_Name_Pascal_FirstLetterToLower}Mapper.getNextVal();
    }

    /**
     * 新增
     */
    @Override
    public void add(${Table_Name_Pascal} record) throws Exception {
        ${Table_Name_Pascal_FirstLetterToLower}Mapper.insertSelective(record);
    }

    /**
     * 修改
     */
    @Override
    public void update(${Table_Name_Pascal} record) throws Exception {
        ${Table_Name_Pascal_FirstLetterToLower}Mapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 删除
     */
    @Override
    public void delete(${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name}) throws Exception {
        ${Table_Name_Pascal_FirstLetterToLower}Mapper.deleteByPrimaryKey(${PKCol.Column_Name});
    }

    /**
     * 获取实体
     */
    @Override
    public ${Table_Name_Pascal} getModel(${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name}) throws Exception {
        return ${Table_Name_Pascal_FirstLetterToLower}Mapper.selectByPrimaryKey(${PKCol.Column_Name});
    }

    /**
     * 获取列表
     */
    @Override
    public List<${Table_Name_Pascal}> selectAll(Map map) throws Exception {
        return ${Table_Name_Pascal_FirstLetterToLower}Mapper.selectAllByMap(map);
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
        List<${Table_Name_Pascal}> list = ${Table_Name_Pascal_FirstLetterToLower}Mapper.selectAllByMap(map);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
