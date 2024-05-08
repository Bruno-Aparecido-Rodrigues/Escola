<?php

include_once 'Conectar.php';

// parte 1 - atributos
class Autor
{
    private $Cod_Autor;
    private $NomeAutor;
    private $sobrenome;
    private $email;
    private $nasc;
    private $conn;

// parte 2 - os gettes e setter

   public function getCod_Autor() {
         return $this->Cod_Autor;
   }

   public function setCod_Autor($codaut) {
    $this->Cod_Autor = $codaut;
   }

   public function getNomeAutor() {
          return $this->NomeAutor;
   }

   public function setNomeAutor ($nautor) {
    $this->NomeAutor= $nautor;
   }

   public function getSobrenome() {
          return $this->sobrenome;
   }

   public function setSobrenome($sobre) {
    $this->sobrenome= $sobre;
   }

   public function getemail() {
    return $this->email;
   }

    public function setemail($emal) {
    $this->email= $emal;
    }
    
   public function getNasc() {
    return $this->nasc;
   }

    public function setNasc($nascimento) {
    $this->nasc= $nascimento;
    }

//parte 3 - métodos

function salvar()
{
    try{
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("insert into autor values (null,?,?,?,?)");
        @$sql->bindParam(1, $this->getNomeAutor(), PDO::PARAM_STR);
        @$sql->bindParam(2, $this->getSobrenome(), PDO::PARAM_STR);
        @$sql->bindParam(3, $this->getemail(), PDO::PARAM_STR);
        @$sql->bindParam(4, $this->getNasc(), PDO::PARAM_STR);
        if($sql->execute() == 1){
            return "<font color='white'><center>Registro salvo com sucesso!</center></font>";
        }
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
   echo "<font color='white'><center>Erro ao salvar o Registro.</center></font> " . $exc->getMessage();
    }
}

   function listar()
   {
       try
       {
           $this-> conn = new Conectar();
           $sql = $this->conn->query("select * from autor order by Cod_Autor");
           $sql->execute();
           return $sql->fetchAll();
           $this->conn = null;
       }
       catch(PDOException $exc)
       {
        echo "Erro ao executar consulta. " . $exc->getMessage();
       }
   }

   function exclusao()
{
     try
     {
        $this->conn = new Conectar ();
        $sql = $this->conn->prepare ("delete from autor where Cod_Autor = ?"); // informei o ? (parametro)
        @$sql-> bindParam(1, $this->getCod_Autor(), PDO:: PARAM_STR); // inclui sata linha para definix o parametro 
        if ($sql->execute() == 1)
        {
         return "<font color='white'><center>Excluido com sucesso!</center></font>";
        }
        else
        {
        return "<font color='white'><center>Erro na exclusao !</center></font>";
        }

        $this->conn = null;
    }
    catch (PDOException $exc)
    {
    echo "<font color='white'><center> Erro ao excluir.</center></font> " . $exc->getMessage();
    }
 }

 function consultar(){
    try
    {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("Select * from autor where NomeAutor like ?"); // informei o ?
        @$sql-> bindParam(1, $this->getNomeAutor(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
        // @$sql-> bindParam(1, $this->getNome(). "%" ,PDO::PARAM_STR);
        $sql->execute();
        return $sql->fetchAll();
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
        echo "<font color='white'><center>Erro ao consultar.!</center></font> " . $exc->getMessage();
    }
}

function alterar()
{
    try
    {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("Select * from autor where Cod_Autor = ?"); // informei o ?
        @$sql-> bindParam(1, $this->getCod_Autor(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
        $sql->execute();
        return $sql->fetchAll();
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
        echo "Erro ao alterar. " . $exc->getMessage();
    }
}

function alterar2()
{
    try
    {
        $this-> conn = new Conectar();
        $sql = $this->conn->prepare("Update autor set NomeAutor = ?,Sobrenome = ?,email = ?, Nasc = ? where Cod_Autor = ?"); // informei o ?
        @$sql-> bindParam(1, $this->getNomeAutor(), PDO::PARAM_STR);
        @$sql-> bindParam(2, $this->getSobrenome(), PDO::PARAM_STR);
        @$sql-> bindParam(3, $this->getemail(), PDO::PARAM_STR);
        @$sql-> bindParam(4, $this->getNasc(), PDO::PARAM_STR);
        @$sql-> bindParam(5, $this->getCod_Autor(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
        if($sql->execute() == 1)
        {
            return "Registro alterado com sucesso!";
        }
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
        echo "Erro ao salvar o registro. " . $exc->getMessage();
    }
}
} //encerramento ed classe Autor
?>