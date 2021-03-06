package ${PackageName}.controller;

import ${PackageName}.comm.Response;
import ${PackageName}.pojo.${TableName_Pascal};
import ${PackageName}.viewpojo.Req${TableName_Pascal};
import ${PackageName}.service.I${TableName_Pascal}Service;

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
 * ${TableName_Pascal}Controller
 * ${Author}
 * ${Date}
 */
@Api(tags = "${TableComment}", value = "${TableComment}")
@RestController
@RequestMapping("/${TableName_Pascal}")
public class ${TableName_Pascal}Controller {

    @Autowired
    private I${TableName_Pascal}Service ${TableName_Pascal_FirstLetterToLower}Service;

    private static final Logger logger = LoggerFactory.getLogger(${TableName_Pascal}Controller.class);

    /**
     * 获取分页数据
     */
    @ApiOperation(value = "获取分页数据")
    @PostMapping("/getData")
    public Response list(@RequestParam Map map) throws Exception {
        PageInfo pageInfo = ${TableName_Pascal_FirstLetterToLower}Service.getList(map);
        return new Response().success(pageInfo.getList(), pageInfo.getTotal());
    }

    /**
     * 获取实体
     */
    @ApiOperation(value = "获取实体")
    @PostMapping("/getOne")
    public Response getOne(@ApiParam(value = "${PKColumnName}") @RequestParam("${PKColumnName}") ${PKColumnType} ${PKColumnName}) throws Exception {
        return new Response().success(${TableName_Pascal_FirstLetterToLower}Service.getModel(${PKColumnName}));
    }

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/add")
    public Response Save(Req${TableName_Pascal} record) throws Exception {

${BaseValidateNotContainPKColumn}

        ${TableName_Pascal} insertRecord = new ${TableName_Pascal}();
        BeanUtils.copyProperties(record, insertRecord);
        ${TableName_Pascal_FirstLetterToLower}Service.add(insertRecord);
        return new Response().success();
    }

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/edit")
    public Response Edit(Req${TableName_Pascal} record) throws Exception {

${BaseValidate}

        ${TableName_Pascal} updateRecord = new ${TableName_Pascal}();
        BeanUtils.copyProperties(record, updateRecord);
        ${TableName_Pascal_FirstLetterToLower}Service.update(updateRecord);
        return new Response().success();
    }

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @PostMapping("/delete")
    public Response remove(@ApiParam(value = "${PKColumnName}") @RequestParam("${PKColumnName}") ${PKColumnType} ${PKColumnName}) throws Exception {
        ${TableName_Pascal_FirstLetterToLower}Service.delete(${PKColumnName});
        return new Response().success();
    }
}
