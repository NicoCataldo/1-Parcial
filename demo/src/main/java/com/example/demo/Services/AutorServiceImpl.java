package com.example.demo.Services;
import com.example.demo.Entities.Autor;
import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> findAll() throws Exception {
        return null;
    }
}
