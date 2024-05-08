<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/stylelistar.css">
    <title>Astronauta シ</title>
</head>
<body>


<center><font face = "Century Gothic" size = "6"><b>Relação de autores Cadastrados</b><br><br><font size = "4">

    <table>
             <tr>
                <th>Cod_Autor</th>
                <th>Nome do Autor</th>
                <th>Sobrenome</th>
                <th>Email</th>
                <th>Nasc</th>
            </tr>

            <?php
                include_once 'Autor.php';
                $p = new Autor();
                $pro_bd=$p->listar();

                ?>
                        
            <?php
                 foreach($pro_bd as $pro_mostrar)
                 {
                        ?>
                    <?php echo "<tr>";?>
                    <?php echo "<td>",$pro_mostrar[0],"</td>"; ?>
                    <?php echo "<td>",$pro_mostrar[1],"</td>"; ?>    
                    <?php echo "<td>",$pro_mostrar[2],"</td>"; ?>
                    <?php echo "<td>",$pro_mostrar[3],"</td>"; ?>  
                    <?php echo "<td>",$pro_mostrar[4],"</td>"; ?>
                    <?php echo "</tr>";?> 

                <?php
                }
             ?>
   


     </table>
            <div class='botao'><a href= '../menu.html' >Voltar</a></div>
    </body>
</html>