<?php

include_once 'Conectar.php';

// parte 1 - atributos
class Livro
{
    private $Cod_livro;
    private $Titulo;
    private $Categoria;
    private $ISBN;
    private $Idioma;
    private $QtdePag;
    private $conn;

// parte 2 - os gettes e setter

   public function getCod_Livro() {
         return $this->cod_li;
   }

   public function setCod_livro($codli) {
    $this->cod_li = $codli;
   }

   public function getTitulo() {
          return $this->titulo;
   }

   public function setTitulo ($title) {
    $this->titulo= $title;
   }

   public function getCategoria() {
          return $this->categoria;
   }

   public function setCategoria($catego) {
    $this->categoria= $catego;
   }

   public function getISBN() {
    return $this->Isbn;
   }

    public function setISBN($isbn) {
    $this->Isbn= $isbn;
    }
    
   public function getIdioma() {
    return $this->idioma;
   }

    public function setIdioma($idio) {
    $this->idioma= $idio;
    }
    
   public function getQtdePag() {
    return $this->Qtdepag;
   }

    public function setQtdePag($qtdepag) {
    $this->Qtdepag= $qtdepag;
    }

    //parte 3 - métodos

function salvar()
{
    try{
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("insert into livro values (null,?,?,?,?,?)");
        @$sql->bindParam(1, $this->getTitulo(), PDO::PARAM_STR);
        @$sql->bindParam(2, $this->getCategoria(), PDO::PARAM_STR);
        @$sql->bindParam(3, $this->getISBN(), PDO::PARAM_STR);
        @$sql->bindParam(4, $this->getIdioma(), PDO::PARAM_STR);
        @$sql->bindParam(5, $this->getQtdePag(), PDO::PARAM_STR);
        if($sql->execute() == 1){
            return "<font color='white'><center>Registro salvo com sucesso!</center></font>";
        }
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
        echo "<font color='white'><center>Erro ao salvar o Registro.</center></font>" . $exc->getMessage();
    }
}


   function listar()
   {
       try
       {
           $this-> conn = new Conectar();
           $sql = $this->conn->query("select * from livro order by Cod_livro");
           $sql->execute();
           return $sql->fetchAll();
           $this->conn = null;
       }
       catch(PDOException $exc)
       {
        echo "<font color='white'><center>Erro ao executar consulta.</center></font> " . $exc->getMessage();
       }
   }

   function exclusao()
   {
        try
        {
           $this->conn = new Conectar ();
           $sql = $this->conn->prepare ("delete from livro where Cod_livro = ?"); // informei o ? (parametro)
           @$sql-> bindParam(1, $this->getCod_Livro(), PDO:: PARAM_STR); // inclui sata linha para definix o parametro 
           if ($sql->execute() == 1)
           {
            return "<font color='white'><center>Excluido com sucesso!</center></font>";
           }
           else
           {
           return "<font color='white'><center>Erro na exclusão !</center></font>";
           }
   
           $this->conn = null;
       }
       catch (PDOException $exc)
       {
       echo "<font color='white'><center> Erro ao excluir. </center></font>" . $exc->getMessage();
       }
    }
   
    function consultar(){
       try
       {
           $this->conn = new Conectar();
           $sql = $this->conn->prepare("Select * from livro where Titulo like ?"); // informei o ?
           @$sql-> bindParam(1, $this->getTitulo(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
           // @$sql-> bindParam(1, $this->getNome(). "%" ,PDO::PARAM_STR);
           $sql->execute();
           return $sql->fetchAll();
           $this->conn = null;
       }
       catch(PDOException $exc)
       {
           echo "<font color='white'><center>Erro ao consultar. </center></font>" . $exc->getMessage();
       }
   }

   function alterar()
{
    try
    {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("Select * from livro where Cod_Livro = ?"); // informei o ?
        @$sql-> bindParam(1, $this->getCod_Livro(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
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
        $sql = $this->conn->prepare("Update livro set Titulo = ?,Categoria = ?,ISBN = ?, Idioma = ?, QtdePag = ? where Cod_Livro = ?"); // informei o ?
        @$sql-> bindParam(1, $this->getTitulo(), PDO::PARAM_STR);
        @$sql-> bindParam(2, $this->getCategoria(), PDO::PARAM_STR);
        @$sql-> bindParam(3, $this->getISBN(), PDO::PARAM_STR);
        @$sql-> bindParam(4, $this->getIdioma(), PDO::PARAM_STR);
        @$sql-> bindParam(5, $this->getQtdePag(), PDO::PARAM_STR);
        @$sql-> bindParam(6, $this->getCod_Livro(), PDO::PARAM_STR); // inclui esta linha linha para definir o parametro
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
} //encerramento ed classe Livro
?>