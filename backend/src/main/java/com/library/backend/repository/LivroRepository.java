package com.library.backend.repository;

import com.library.backend.model.Livro;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class LivroRepository implements JpaRepository<Livro, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Livro> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Livro> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Livro> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Livro getOne(Long aLong) {
        return null;
    }

    @Override
    public Livro getById(Long aLong) {
        return null;
    }

    @Override
    public Livro getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Livro> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Livro> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Livro> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Livro> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Livro> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Livro> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Livro, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Livro> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Livro> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Livro> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Livro> findAll() {
        return List.of();
    }

    @Override
    public List<Livro> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Livro entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Livro> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Livro> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Livro> findAll(Pageable pageable) {
        return null;
    }
}
