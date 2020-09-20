#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;
import ${package}.entity.Demo;

public interface DemoService {
    void run(String userId);

    List<Demo> getAllObjects();

    void delete(String id);

    Demo update(String id, String str);

    Demo findById(String id);
}
