package sample.model;

import lombok.Builder;
import lombok.Data;
import sample.vo.Sample;

@Data
public class ApiResponse {
	private Integer status;
	private Object result;

	@Builder
	public ApiResponse(Integer status, Sample result){
		this.status = status;
		this.result = result;
	}
}
