<?php

include_once 'Conectar.php';

// parte 1 - atributos
class Autoria
{
    private $Cod_autor;
    private $Cod_livro;
    private $DataLancamento;
    private $Editora;
    private $conn;

// parte 2 - os gettes e setter

   public function getCod_autor() {
         return $this->cod_aut;
   }

   public function setCod_autor($codaut) {
    $this->cod_aut = $codaut;
   }

    public function getCod_livro() {
    return $this->cod_li;
    }

   public function setCod_livro($codli) {
   $this->cod_li = $codli; 
   }

   public function getDataLancamento() {
          return $this->datalan;
   }

   public function setDatalancamento($datal) {
    $this->datalan= $datal;
   }

   public function getEditora() {
    return $this->editora;
   }

    public function setEditora($edit) {
    $this->editora= $edit;
    }

    //parte 3 - métodos

function salvar()
{
    try{
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("insert into autoria values (?,?,?,?)");
        @$sql->bindParam(1, $this->getCod_autor(), PDO::PARAM_STR);
        @$sql->bindParam(2, $this->getCod_livro(), PDO::PARAM_STR);
        @$sql->bindParam(3, $this->getDataLancamento(), PDO::PARAM_STR);
        @$sql->bindParam(4, $this->getEditora(), PDO::PARAM_STR);
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
           $sql = $this->conn->query("select * from autoria order by Editora");
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
           $sql = $this->conn->prepare ("delete from autoria where Cod_Autor = ? and Cod_Livro = ?"); // informei o ? (parametro)
           @$sql-> bindParam(1, $this->getCod_autor(), PDO:: PARAM_STR); // inclui sata linha para definix o parametro 
           @$sql-> bindParam(2, $this->getCod_livro(), PDO:: PARAM_STR); // inclui sata linha para definix o parametro 
           if ($sql->execute() == 1)
           {
            return "<font color='white'><center>Excluido com sucesso!</center></font> ";
           }
           else
           {
           return "<font color='white'><center>Erro na exclusao !</center></font> ";
           }
   
           $this->conn = null;
       }
       catch (PDOException $exc)
       {
       echo "<font color='white'><center> Erro ao excluir. </center></font> " . $exc->getMessage();
       }
    }
   
    function consultar(){
       try
       {
           $this->conn = new Conectar();
           $sql = $this->conn->prepare("Select * from autoria where Editora like ?"); // informei o ?
           @$sql-> bindParam(1, $this->getEditora(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
           // @$sql-> bindParam(1, $this->getNome(). "%" ,PDO::PARAM_STR);
           $sql->execute();
           return $sql->fetchAll();
           $this->conn = null;
       }
       catch(PDOException $exc)
       {
           echo "<font color='white'><center> Erro ao consultar. </center></font>" . $exc->getMessage();
       }
   }

   function alterar()
{
    try
    {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("Select * from autoria where Cod_Autor = ? and Cod_Livro = ?"); // informei o ?
        @$sql-> bindParam(1, $this->getCod_Autor(), PDO::PARAM_STR);
        @$sql-> bindParam(2, $this->getCod_Livro(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
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
        $this-> conn = new Conectar(); //tem que mudar  esses nomes no update
        $sql = $this->conn->prepare("Update autoria set DataLancamento = ?,Editora = ? where Cod_Autor = ? and Cod_Livro = ?"); // informei o ?
        @$sql-> bindParam(1, $this->getDataLancamento(), PDO::PARAM_STR);
        @$sql-> bindParam(2, $this->getEditora(), PDO::PARAM_STR);
        @$sql-> bindParam(3, $this->getCod_Autor(), PDO::PARAM_STR);
        @$sql-> bindParam(4, $this->getCod_Livro(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
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