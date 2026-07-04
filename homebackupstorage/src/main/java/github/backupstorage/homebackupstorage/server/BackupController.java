package github.backupstorage.homebackupstorage.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/v1/home")
public class BackupController {
    
    private final BackupService backupService;

    public BackupController(BackupService backupService){
        this.backupService = backupService;
    }

    @PostMapping("/backup")
    public ResponseEntity<Object> uploadFile(@RequestParam() MultipartFile file){
        String storedFileName = backupService.storeFile(file);

        return ResponseEntity.ok(storedFileName);
    }

}
