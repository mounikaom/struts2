<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">




<head>

<title>The Man in Blue &gt; Experiments &gt; widgEditor</title>

<meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
<meta name="author" content="The Man in Blue" />
<meta name="robots" content="all" />
<meta name="MSSmartTagsPreventParsing" content="true" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<style type="text/css" media="all">
	@import "css/info.css";
	@import "css/main.css";
	@import "css/widgEditor.css";
</style>

<script type="text/javascript" src="js/widgEditor.js"></script>

</head>



<body>
	<!-- <div id="experimentInfo">
		
		
	</div> -->
<!-- END experimentInfo -->
	<div id="content">
		<h2>
			widgEditor
		</h2>
		<p>
			
		</p>
		<p>
			</p>
		<p>
			</p>
		<form action="contactus" onsubmit="alert('Your submitted HTML was:\n\n'+ document.getElementById('email').value + document.getElementById('noise').value); return true;" method="post">
			<input type=text name="email" >Enter Email</input>
			<input type=text name="phone" >Enter Phone</input>
			<fieldset>
				<label for="noise">
					Make some noise:
				</label>
				<textarea id="noise" name="noise" class="widgEditor nothing">&lt;p&gt;widgEditor &lt;strong&gt;automatically&lt;/strong&gt; integrates the content that was in the textarea!&lt;/p&gt;</textarea>
			</fieldset>
			<fieldset class="submit">
				<input type="submit" value="Send Email" />
			</fieldset>
		</form>
	</div>
<!-- END content -->
</body>




</html>
