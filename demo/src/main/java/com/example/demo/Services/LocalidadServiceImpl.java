package com.example.demo.Services;

import com.example.demo.Entities.Localidad;
import com.example.demo.Repositories.BaseRepository;

import java.util.List;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Localidad> findAll() throws Exception {
        return null;
    }
}
