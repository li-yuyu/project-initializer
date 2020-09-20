#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller;

import ${package}.common.Results;
package ${package}.api.DemoApi;
import ${package}.dto.DemoDTO;
import ${package}.dto.DemoVO;
import ${package}.service.DemoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "Demo Process")
public class DemoController implements DemoApi {

    @Resource
    private DemoService demoService;

    @ApiOperation(value = "demoDTO run", notes = "return List demoDTO")
    @Override
    public Result<List<ResDemoDTO>> run(ReqDemoDTO demoDTO) {
        if (demoDTO != null && "test".equals(demoDTO.getUserId())) {
            return Results.TEST_USER;
        }
        try {
            List<ResDemoDTO> data = new ArrayList<>();
            demoService.run(demoDTO.getUserId());
            return Result.success(data);
        } catch (Exception e) {
            Logger.error("DemoFacadeImpl run exception:" + e.getMessage(), e);
            return Result.error(e);
        }
    }
}
