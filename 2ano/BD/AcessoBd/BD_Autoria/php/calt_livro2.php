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
            include_once 'Livro.php';
            $p = new Livro();
            $p->setCod_Livro($txtid);
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
               <input name="txtitle" type="text" id="titulo" placeholder=" " value='<?php echo $pro_mostrar[1]?>'>
               <label id="labelTitulo" for="titulo">Título</label>
            </div>

            <div class="label-float">
               <input name="txtcate" type="text" id="categoria" placeholder=" " value='<?php echo $pro_mostrar[2]?>'>
               <label id="labelCategoria" for="categoria">Categoria</label>
            </div>

            <div class="label-float">
               <input name="txtisbn" type="text" id="isbn" placeholder=" " value='<?php echo $pro_mostrar[3]?>'>
               <label id="labelISBN" for="isbn">ISBN</label>
            </div>

            <div class="label-float">
               <input name="txtidioma" type="text" id="idioma" placeholder=" " value='<?php echo $pro_mostrar[4]?>'>
               <label id="labelIdioma" for="idioma">Idioma</label>
            </div>

            <div class="label-float">
               <input name="txtqtpag" type="text" id="qtpag" placeholder=" " value='<?php echo $pro_mostrar[5]?>'>
               <label id="labelqtpag" for="qtpag">QtdePag</label>
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
         include_once 'Livro.php';
         $pro=new Livro();
         $pro->setTitulo($txtitle);
         $pro->setCategoria($txtcate);
         $pro->setISBN($txtisbn);
         $pro->setIdioma($txtidioma);
         $pro->setQtdePag($txtqtpag);
         $pro->setCod_Livro($txtid);
          echo "<h3><br><br>" . $pro->alterar2() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>