# Home backup storage 

```Note: this is not a secure backup storage because it was designed to run on the local home network with trusted devices.```

## The motivation
After I have built my home lab, I wanted to have a backup service to my notes so I can backup my notes under my control and without charges.

## The solution
The proposed solution is the most simple thing, it recive files over multipart http requests and store it under the configured path and prefix enviroment variables in the properities file. you must to configure the os enviroment variables to have it work. 


## Installition 
you can pull the docker image now by 
```
docker pull afalosaimi/home-backup-storage:1.0.0
```