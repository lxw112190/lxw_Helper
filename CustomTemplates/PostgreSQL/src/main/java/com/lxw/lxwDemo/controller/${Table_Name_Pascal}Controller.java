package ${PackageName}.controller;

import ${PackageName}.comm.Response;
import ${PackageName}.pojo.${Table_Name_Pascal};
import ${PackageName}.viewpojo.Req${Table_Name_Pascal};
import ${PackageName}.service.I${Table_Name_Pascal}Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

 /**
 * ${Table_Name_Pascal}Controller
 * ${Author}
 * ${Date}
 */
@Api(tags = "${Table_Comments}", value = "${Table_Comments}")
@RestController
@RequestMapping("/${Table_Name_Pascal}")
public class ${Table_Name_Pascal}Controller {

    @Autowired
    private I${Table_Name_Pascal}Service ${Table_Name_Pascal_FirstLetterToLower}Service;

    private static final Logger logger = LoggerFactory.getLogger(${Table_Name_Pascal}Controller.class);

    /**
     * 获取分页数据
     */
    @ApiOperation(value = "获取分页数据")
    @PostMapping("/getData")
    public Response list(@RequestParam Map map) throws Exception {
        PageInfo pageInfo = ${Table_Name_Pascal_FirstLetterToLower}Service.getList(map);
        return new Response().success(pageInfo.getList(), pageInfo.getTotal());
    }

    /**
     * 获取实体
     */
    @ApiOperation(value = "获取实体")
    @PostMapping("/getOne")
    public Response getOne(@ApiParam(value = "${PKCol.Column_Name}") @RequestParam("${PKCol.Column_Name}") ${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name}) throws Exception {
        return new Response().success(${Table_Name_Pascal_FirstLetterToLower}Service.getModel(${PKCol.Column_Name}));
    }

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/add")
    public Response Save(Req${Table_Name_Pascal} record) throws Exception {

${BaseValidateNotContainPKColumn}

        ${Table_Name_Pascal} insertRecord = new ${Table_Name_Pascal}();
        BeanUtils.copyProperties(record, insertRecord);
        ${Table_Name_Pascal_FirstLetterToLower}Service.add(insertRecord);
        return new Response().success();
    }

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/edit")
    public Response Edit(Req${Table_Name_Pascal} record) throws Exception {

${BaseValidate}

        ${Table_Name_Pascal} updateRecord = new ${Table_Name_Pascal}();
        BeanUtils.copyProperties(record, updateRecord);
        ${Table_Name_Pascal_FirstLetterToLower}Service.update(updateRecord);
        return new Response().success();
    }

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @PostMapping("/delete")
    public Response remove(@ApiParam(value = "${PKCol.Column_Name}") @RequestParam("${PKCol.Column_Name}") ${PKCol.Column_Name_Java_Type} ${PKCol.Column_Name}) throws Exception {
        ${Table_Name_Pascal_FirstLetterToLower}Service.delete(${PKCol.Column_Name});
        return new Response().success();
    }
}
