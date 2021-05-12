<?php
	foreach ($_POST as $key => $value) {
		switch ($key) {
			case 'firstKey':
				$Sequence = $value;
				break;
			case 'secondKey':
				$Name = $value;
				break;
			case 'thirdKey':
				$X = $value;
				break;
			case 'fourthKey':
				$Y = $value;
				break;
			case 'fifthKey':
				$random1 = $value;
				break;
			case 'sixthKey':
				$random2 = $value;
				break;
		}
	}
		$conn = new mysqli("localhost", "root", "", "urbanization");
		
		if ($conn->connect_error){
			die("Connection failed: " + $conn->connect_error);
		}
	
		$sql = "INSERT INTO data (SequenceNumber, CityName, X, Y, random1, random2) 
				VALUES ({$_POST["Sequence"]}, '{$_POST["Name"]}', {$_POST["X"]}, 
				{$_POST["Y"]}, {$_POST["random1"]}, {$_POST["random2"]})";
		
		if ($conn->query($sql) === TRUE) {
			echo "Succesfuly sent!";
		}else {
			echo "Error: " . $sql . "<br>" . $conn->error;
		}
	

	$conn->close();
?>



