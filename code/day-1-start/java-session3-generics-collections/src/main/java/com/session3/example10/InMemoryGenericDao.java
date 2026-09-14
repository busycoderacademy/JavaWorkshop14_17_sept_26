package com.session3.example10;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemoryGenericDao<T extends Entity<ID>, ID> implements GenericDao<T, ID> {
    private final List<T> entities = new ArrayList<>();

    @Override
    public T save(T entity) {
        entities.add(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        for (int i = 0; i < entities.size(); i++) {
            if (Objects.equals(entities.get(i).getId(), entity.getId())) {
                entities.set(i, entity);
                return entity;
            }
        }
        return save(entity);
    }

    @Override
    public void delete(ID id) {
        entities.removeIf(entity -> Objects.equals(entity.getId(), id));
    }

    @Override
    public T findById(ID id) {
        for (T entity : entities) {
            if (Objects.equals(entity.getId(), id)) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public List<T> findByProperty(String property, Object value) {
        List<T> result = new ArrayList<>();

        for (T entity : entities) {
            try {
                Field field = entity.getClass().getDeclaredField(property);
                field.setAccessible(true);

                if (Objects.equals(field.get(entity), value)) {
                    result.add(entity);
                }
            } catch (NoSuchFieldException | IllegalAccessException exception) {
                throw new IllegalArgumentException(
                        "Cannot find property: " + property, exception);
            }
        }

        return result;
    }
}
