package com.stefanwebdev.service;

import com.stefanwebdev.model.Sample;
import org.springframework.stereotype.Service;

/**
 * Created by stefanvlahov on 1/7/17.
 */

@Service
public class SampleService {

    public Sample createSample(String sampleName) {

        Sample sample = new Sample();
        sample.setName(sampleName);

        return sample;
    }

}
