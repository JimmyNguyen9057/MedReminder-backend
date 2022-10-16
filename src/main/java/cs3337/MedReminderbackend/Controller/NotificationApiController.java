package cs3337.MedReminderbackend.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import cs3337.MedReminderbackend.Util.MyLogger;


@RestController
@RequestMapping("/api/notification")
public class NotificationApiController
{
    
    public NotificationApiController()
    {
        MyLogger.info("Construct NotificationApiController.");
    }
    
    
    // api
    
    
}
