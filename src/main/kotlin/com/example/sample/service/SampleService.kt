package com.example.sample.service

import com.example.sample.mapper.SampleMapper
import com.example.sample.model.SampleModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class SampleService @Autowired constructor(var mapper: SampleMapper) {

    fun find() : List<SampleModel> {
        return mapper.find()
    }

}