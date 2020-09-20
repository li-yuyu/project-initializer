#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.com.lyle.projectinitializer.api;

import ${package}.com.lyle.projectinitializer.dto.DemoDTO;
import ${package}.com.lyle.projectinitializer.dto.DemoVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "${parentArtifactId}")
public interface DemoApi {

    /**
     * @param demoDTO
     * @return
     */
    @PostMapping(value = "/run")
    Result<List<DemoVO>> run(DemoDTO dto);
}