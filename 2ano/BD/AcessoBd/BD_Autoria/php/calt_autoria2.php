<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1>Alteração de Autorias Cadastradas</h1>
    
    <?php
            $txtida=$_POST["txtida"];
            $txtidl=$_POST["txtidl"];
            include_once 'Autoria.php';
            $p = new Autoria();
            $p->setCod_Autor($txtida);
            $p->setCod_Livro($txtidl);
            $pro_bd=$p->alterar();//chamada de método com retorno - $p é o parâmetro enviado
        ?>

    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    <?php
        foreach($pro_bd as $pro_mostrar)
        {
        ?>
            <div class="label-float">
               <input type="hidden" name="txtida" size="5" value='<?php echo $pro_mostrar[0]?>' id="codau">
               <label id="labelTitulo" for="titulo">ID do Autor <?php echo $pro_mostrar[0]?></label>
            </div>
            <div class="label-float">
               <input type="hidden" name="txtidl" size="5" value='<?php echo $pro_mostrar[1]?>' id="codau">
               <label id="labelTitulo" for="titulo">ID do Livro <?php echo $pro_mostrar[1]?></label>
            </div>
            <br>
            <div class="label-float">
               <input name="txtedit" type="text" id="nomedit" value='<?php echo $pro_mostrar[3]?>'>
               <label id="labelTitulo" for="titulo">Nome da Editora</label>
            </div>

            <div class="label-float">
               <input name="txtdat" type="text" id="datlan" value='<?php echo $pro_mostrar[2]?>'>
               <label id="labelCategoria" for="categoria">Data de lançamento</label>
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
         include_once 'Autoria.php';
         $pro=new Autoria();
         $pro->setDatalancamento($txtdat);
         $pro->setEditora($txtedit);
         $pro->setCod_autor($txtida);
         $pro->setCod_livro($txtidl);
          echo "<h3><br><br>" . $pro->alterar2() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>