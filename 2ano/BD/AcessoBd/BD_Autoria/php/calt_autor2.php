<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1>Alteração de Autores Cadastrados</h1>
    
    <?php
            $txtid=$_POST["txtid"];
            include_once 'Autor.php';
            $p = new Autor();
            $p->setCod_Autor($txtid);
            $pro_bd=$p->alterar();//chamada de método com retorno - $p é o parâmetro enviado
        ?>

    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    <?php
        foreach($pro_bd as $pro_mostrar)
        {
        ?>
            <div class="label-float">
               <input type="hidden" name="txtid" size="5" value='<?php echo $pro_mostrar[0]?>' id="codau">
               <label id="labelTitulo" for="titulo">ID do Autor <?php echo $pro_mostrar[0]?></label>
            </div>
            <br>
            <div class="label-float">
               <input name="txtnome" type="text" id="nomeau" value='<?php echo $pro_mostrar[1]?>'>
               <label id="labelTitulo" for="titulo">Nome do Autor</label>
            </div>

            <div class="label-float">
               <input name="txtsobren" type="text" id="sobre" value='<?php echo $pro_mostrar[2]?>'>
               <label id="labelCategoria" for="categoria">Sobrenome</label>
            </div>

            <div class="label-float">
               <input name="txtemail" type="text" id="email" value='<?php echo $pro_mostrar[3]?>'>
               <label id="labelISBN" for="isbn">Email</label>
            </div>

            <div class="label-float">
               <input name="txtnasc" type="text" id="dtl" size="10" value='<?php echo $pro_mostrar[4]?>'>
               <label id="labelIdioma" for="idioma">Nascimento</label>
            </div>

            
            <div class='justify-center'>
            <button name="btnalterar" type="submit" value="Alterar">Alterar</button>
            <button name="limpar" type="reset" value="Limpar">Limpar</button>
            </div>

    
         </div>
        </div>
       <?php
        }        
         ?>
  </form>

     <?php
     extract($_POST, EXTR_OVERWRITE);
     if(isset($btnalterar))
      {
         include_once 'Autor.php';
         $pro=new Autor();
         $pro->setNomeAutor($txtnome);
         $pro->setSobrenome($txtsobren);
         $pro->setemail($txtemail);
         $pro->setNasc($txtnasc);
         $pro->setCod_Autor($txtid);
          echo "<h3><br><br>" . $pro->alterar2() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>