package user.com.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
	public class GlobalException {
		
		@ExceptionHandler(NameNotFound.class)
		public ResponseEntity<ErrorDetails> resourceNotFound(NameNotFound ex,WebRequest request){
			ErrorDetails response = new ErrorDetails();
			response.setErrorCode(611);
			response.setErrorMessage(ex.getMessage());
			
			return new ResponseEntity<ErrorDetails>(response,HttpStatus.NOT_FOUND);
		}
		
		
		@ExceptionHandler(EmailNotEmpty.class)
		public ResponseEntity<ErrorDetails> resourceNotFound(EmailNotEmpty ex,WebRequest request){
			ErrorDetails response = new ErrorDetails();
			response.setErrorCode(613);
			response.setErrorMessage(ex.getMessage());
			
			return new ResponseEntity<ErrorDetails>(response,HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler(ContactNotEmpty.class)
		public ResponseEntity<ErrorDetails> resourceNotFound(ContactNotEmpty ex,WebRequest request){
			ErrorDetails response = new ErrorDetails();
			response.setErrorCode(614);
			response.setErrorMessage(ex.getMessage());
			
			return new ResponseEntity<ErrorDetails>(response,HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler(AddressNotEmpty.class)
		public ResponseEntity<ErrorDetails> resourceNotFound(AddressNotEmpty ex,WebRequest request){
			ErrorDetails response = new ErrorDetails();
			response.setErrorCode(612);
			response.setErrorMessage(ex.getMessage());
			
			return new ResponseEntity<ErrorDetails>(response,HttpStatus.NOT_FOUND);
		}

		/*@Override
		protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
				HttpHeaders headers, HttpStatus status, WebRequest request) {
			Map<String, String> errors = new HashMap<>();
			ex.getBindingResult().getAllErrors().forEach((error) -> {
				String fieldName = ((FieldError) error).getField();
				String message = error.getDefaultMessage();
				errors.put(fieldName, message);
			});
			return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
		}*/

	}



