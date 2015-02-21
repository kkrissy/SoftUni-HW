<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Word Mapping</title>
        <style>
        	td {
        		background-color:yellow;
        		width:100px;
        		padding:5px;
        	}
        	td:last-child {
        		background-color:lightblue;
        		width:100px;
        		padding:5px;
        	}
        </style>
    </head>
    <body>
    	   <form method="post" action="">
            <textarea rows="3" cols="70" type="text" name="words">
            	</textarea>
            	<br/>
            <input type="submit" value="Count words" /> 
            </form>   
    </body>
    </html>  
<?php if (isset($_POST['words'])) : ?>
  <table border="1">
  	<?php
      $words = htmlentities($_POST['words']);
      $input = preg_split('/((^\p{P}+)|(\p{P}*\s+\p{P}*)|(\p{P}+$))/', $words, -1, PREG_SPLIT_NO_EMPTY);
      $input = array_map('strtolower', $input);
      $output = array_count_values($input);
      arsort($output);
      foreach ($output as $key => $value) {
            echo "<tr><td>$key</td><td>$value</td></tr>";
        }
        ?>
  </table>
<?php
endif;
?> 
