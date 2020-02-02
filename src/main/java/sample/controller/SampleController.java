package sample.controller;

import sample.model.ApiResponse;
import sample.service.SampleService;
import sample.vo.Sample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class SampleController {

	@Autowired
	SampleService sampleService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value="/api/v1", method = RequestMethod.GET)
	public ApiResponse sample(){
		Sample result = sampleService.test();
		ApiResponse.builder().build();
		return ApiResponse.builder().status(HttpStatus.OK.value()).result(result).build();
	}
}
