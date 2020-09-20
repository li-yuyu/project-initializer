#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.service.DemoService;
import ${package}.dao.model.Demo;
import ${package}.dao.mapper.DemoMapper;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    private final DemoMapper demoMapper;

    @Autowired
    public DemoServiceImpl(DemoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }

    @Override
    public void run(String userId) {
        Logger.info("calling DemoService run method.");
    }

    @Override
    public List<Demo> getAllObjects() {
        return demoMapper.findAll();
    }

    @Override
    public void delete(String id) {
        demoMapper.delete(id);
    }

    @Override
    public Demo update(String id, String str) {
        Demo object = findById(id);
        object.setContents(str);
        return demoMapper.save(object);
    }

    @Override
    public Demo findById(String id) {
        return demoMapper.findOne(id);
    }
}
