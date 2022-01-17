<HTML>
<HEAD>
</HEAD>
<title>San Silvestro</title> 
<BODY>
<jsp:useBean id="SanSilvestro" class="SSBean.giorniSS"/>
<H2>San Silvestro </H2>
<HR>
<CENTER>
<H3>Giorni mancanti: 
<jsp:getProperty name="SanSilvestro" property="giorni"/>
</H3>
<H3>Stagione: 
<jsp:getProperty name="SanSilvestro" property="stagione"/>
</CENTER>
<HR>
</BODY>
</HTML>