#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;
import ${package}.entity.Demo;

import java.util.List;


public interface DemoMapper {

    List<Demo> findAll();

    Demo save(Demo obj);

    void delete(String id);

    Demo findOne(String id);


}