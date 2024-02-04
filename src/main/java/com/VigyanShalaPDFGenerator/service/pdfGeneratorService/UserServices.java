package com.VigyanShalaPDFGenerator.service.pdfGeneratorService;

//import com.vigyanshaala.entity.user.UserRole;
//import com.vigyanshaala.response.Response;
import com.VigyanShalaPDFGenerator.entity.user.UserRole;
import com.VigyanShalaPDFGenerator.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface UserServices {
    ResponseEntity getUserInfo( String email);
    Response addUserRole(UserRole userRole);
    Response uploadUserFile(MultipartFile file) throws IOException;

}
