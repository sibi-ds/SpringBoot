package com.example.demo.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public abstract class BaseService<Model extends BaseModel, Entity extends BaseEntity> {

    @Autowired
    private BaseMapper<Model, Entity> baseMapper;

    @Autowired
    private BaseRepository<Entity> baseRepository;

    public Model save(Model incomingModel) {
        Entity incomingEntity = baseMapper.modelToEntity(incomingModel);
        Entity saveEntity = baseRepository.save(incomingEntity);
        Model savedModel = baseMapper.entityToModel(saveEntity);
        return savedModel;
    }

    public Model getById(Long id) {
        Optional<Entity> savedEntity = baseRepository.findById(id);
        if (!savedEntity.isPresent()) {
            return null;
        }
        Model savedModel =  baseMapper.entityToModel(savedEntity.get());
        return savedModel;
    }
}
