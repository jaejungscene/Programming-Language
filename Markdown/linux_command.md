

## linux command
* **man**  
***man [command]***  
command에 대해 설명을 해준다.

* **|**  
*command_1 | command_2*  
command_1 명령어를 실행하고 그 결과를 argument로 하는 command_2 명령어를 실행하여 결과를 보여준다.

* **touch**  
*touch [file_name]...*  
file_name에 해당하는 empty file을 생성해 준다.

* **date**  
*date*  
output -> (week) (month) (day) (hour:minute:second) (standard) (year)

* **ln**  
*ln -s [source_file] [new_file(이미 있는 file은 안됨)]*  
source_file을 가리키는 new_file을 생성, 즉 soft link(=symbolic link) 생성.  
-> soft link file 크기(byte)는 source_file의 파일명을 크기이다.  
*ln [source_file] [new_file(이미 있는 file은 안됨)]*  
source_file이 가리키는 original file을 new_file도 가리키게 하는 hard link 생성.  
  - **주의사항**  
  어떤 directory에서 soft link file을 다른 directory로 ***mv***하면 가리키는 file의 이름이 바뀌어야 함으로(e.g. 기존 file이름=="file" --> child directory로 갔을 시 기존 file이름=="../file") **soft link는 재기능을 하지 못 한다.** 또한 **cp** command로 soft 또는 hard link의 file들을 다른 directory로 이동시키면 **link들이 다 깨지면서 그 파일들이 가리키고 있던 file 데이터들이 독립적으로 생성되어 copy된 각각의 file들은 고유의 inode를 갖는 file 데이터들을 가지게 된다.**

* **chmod**  
**[option]**  
  way1) scope = u(user), g(group), o(other), a(all) / r(read), w(writ), x(execution) / +(권한 추가), -(권한 제거), =(권한 set)<br>
    e.g.) chmode u+x [file]  --> file의 user 권한에서 execution을 추가한다.<br>
  ** 주의사항 **<br>
   예를들어 group의 read 권한만 permission되어 있는 상태에서 usr가 group에 속해 있던 속해 있지 않던 usr는 그 파일을 열 수 없다. 즉, permission은 포함관계에 있는 것이아니라 서로 독립적인 permission을 가지고 있다.

* **kill**  
  **SIGKILL** – SIGKILL is the ultimate way of killing a process. It will always kill a process and will kill the process abruptly, generating a fatal error.SIGKILL should always work. If it does not work, the operating system has failed.  
  **SIGTERM** – SIGTERM attempts to kill a process, but unlike SIGKILL it may be blocked or otherwise handled. It can be considered a gentler way of attempting to terminate a process.  

* **tee**  
  stdin에서 값을 읽어오고, 읽어온 값을 stdout과 지정한 file에 쓴다 (file에 덮어 씌워짐)<br>
  즉, tee만을 terminal에 입력하면 cat만을 terminal에 입력한 것과 같은 효과를 갖는다.

* **tty**  
  print the file name of the terminal connected to standard input (key board)

* **"<<"**<br>
  cat을 실행해 stdin에서 문자들을 받고, 받는 문자들에서 "<<" 오른쪽에 정의된 문자가 나오면 stdin을 종료 후, 입력한 문자들에 대한 명령어를 실행<br>
  e.g.) grep babo << EOT<br>

* **">>"**<br>
  왼쪽에서 stdout(stderr는 안 됨)값을 받아 오른쪽 파일 뒤에 문자를 concatnate한다. (즉, ">"와 같이 덮어쓰지 않음)<br>

* **"<<<"**<br>
  오른쪽 값이 그대로 왼쪽 프로세스의 stdin으로 들어간다.<br>
  ./a.out <<< 9001<br>

* **bg, fg**<br>
  jobs의 번호는 "%1"와 같이 ***%job_number***로 표현한다.<br>
  명령 뒤에 **&**를 붙이면 bg로 프로세스가 실행된다.<br>
  ** 주의사항 **<br>
  stdin을 쓰는 command는 background로 실행시킬 수 없다.

* ls -h : file의 크기들이 human-reable하게 나온다.   
* ls -A : "."와 ".."는 보여주지 않음.  
* du : summarize disk usage of the set of FIlEs  
* which  

* tar -cvf  
* tar -xvf  
* tar -tvf  
* gzip  
* tar -xvfz  


## about linux
* **"/dev/pts/" vs "/dev/tty"**<br>
 [go to site](https://www.golinuxcloud.com/difference-between-pty-vs-tty-vs-pts-linux/#:~:text=%2Fdev%2Fpts%20contains%20entries%20corresponding,%2DTTYs%2C%20or%20PTYs)<br><br> 

* **/dev**  
  the location of special or device files<br><br>

* **file types**
  - – : regular file
  - d : directory
  - c : character device file (like keyboard, serial ports, mouse, ...)
  - b : block device file (like disk, ssd, ...)
  - s : local socket file
  - p : named pipe
  - l : symbolic link
  - [go to site for detail](https://linuxconfig.org/identifying-file-types-in-linux#:~:text=Let%20us%20have%20a%20look,b%20%3A%20block%20device%20file)<br><br>

* **/etc/passwd**  --> [go to site for](https://linuxize.com/post/etc-passwd-file/#:~:text=%2Fetc%2Fpasswd%20is%20a%20plain,readable%20by%20all%20system%20users.)<br><br>

* **inode**  
파일에 부여된 고유한 숫자(program의 고유 숫자) --> [detail](https://en.wikipedia.org/wiki/Inode#:~:text=The%20inode%20(index%20node)%20is,locations%20of%20the%20object's%20data.)  

* **/dev/null**  


## bash
* **중요** : **bash에선 0이 true이고, 1이 false이다!!!**
* pts는 pseudo terminal이다  
* $?  
  This is the exit status of the last executed command. For example the command true always returns a status of 0 and false always returns a status of 1:  
  ``true``  
  ``echo $? # echoes 0``  
  ``false``  
  ``echo $? # echoes 1``  
  From the manual: (acessible by calling man bash in your shell)  
  "$?" Expands to the exit status of the most recently executed foreground pipeline.
