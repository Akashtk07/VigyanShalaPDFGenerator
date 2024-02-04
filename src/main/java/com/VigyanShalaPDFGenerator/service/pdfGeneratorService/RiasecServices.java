package com.VigyanShalaPDFGenerator.service.pdfGeneratorService;

//import com.vigyanshaala.model.pdfGeneratorModel.RiasecTemplate;
//import com.vigyanshaala.response.Response;
import com.VigyanShalaPDFGenerator.model.pdfGeneratorModel.RiasecTemplate;
import com.VigyanShalaPDFGenerator.response.Response;
import org.springframework.http.ResponseEntity;

public interface RiasecServices {
    Response saveRiasecTemplate(RiasecTemplate riasecTemplate);
    ResponseEntity getRiasecTemplate(String studentEmailID, Long version);
    ResponseEntity getRiasecLatestVersion(String studentEmailID);
}
