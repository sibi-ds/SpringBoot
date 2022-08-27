package com.example.demo.base;

import org.springframework.stereotype.Component;

@Component
public interface BaseMapper<Model extends BaseModel, Entity extends BaseEntity> {

    public Entity modelToEntity(Model model);

    public Model entityToModel(Entity entity);
}
