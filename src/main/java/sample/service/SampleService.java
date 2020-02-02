package sample.service;

import sample.vo.Sample;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	public Sample test(){
		Sample sample = new Sample();
		sample.setMessage("success");
		return sample;
	}
}
