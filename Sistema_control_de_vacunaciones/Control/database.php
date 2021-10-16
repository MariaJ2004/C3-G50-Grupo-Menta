<?php
class database {
public $dbConn;
protected $result;
protected $query;
protected $prepare;

public function __construct($dbhost,$dbuser,$dbpass,$dbname,$charset) {
    $this->dbConn = new mysqli($dbhost,$dbuser,$dbpass,$dbname);
    if($this->dbConn->connect_errno) {
        trigger_error("Error trying to connect to MYSQL, error type: {$this -> dbConn -> connect_error()}",E_USER_ERROR);
    }
    this -> dbConn ->set_charset($'utf8');
}
public function getPaciente(){
    $this->result = $this->dbConn->query("select * from registroPaciente");
    return $this->result->fetch_all();
}


}

?>