--
-- Dumping data for table `harbor`
--

LOCK TABLES `harbor` WRITE;
/*!40000 ALTER TABLE `harbor` DISABLE KEYS */;
INSERT INTO `harbor` VALUES (1,18.414549,-64.615315,'Waterfront Dr, Road Town'),(2,18.446651,-64.529587,'Trellis Bay'),(3,18.387113,-64.513346,'Manchioneel Bay'),(4,18.424007,-64.568263,'Ber Bay'),(5,18.317804,-64.614617,'The Bight Bay');
/*!40000 ALTER TABLE `harbor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `mooring_ball`
--

LOCK TABLES `mooring_ball` WRITE;
/*!40000 ALTER TABLE `mooring_ball` DISABLE KEYS */;
INSERT INTO `mooring_ball` VALUES (101,18.414802,-64.614932,'Mooring ball #1','Fawne Godsal','30$','\0',1),(102,18.414705,-64.614995,'Mooring ball #2','Fawne Godsal','30','\0',1),(103,18.414621,-64.615051,'Mooring ball #3','Fawne Godsal','30','\0',1),(104,18.414755,-64.614817,'Mooring ball #4','Fawne Godsal','30','\0',1),(105,18.414655,-64.614858,'Mooring ball #5','Fawne Godsal','30','\0',1),(106,18.414541,-64.614903,'Mooring ball #6','Fawne Godsal','30','\0',1),(107,18.414865,-64.615677,'Mooring ball #7','Tynan Buckerfield','30','\0',1),(108,18.414765,-64.615668,'Mooring ball #8','Tynan Buckerfield','30','\0',1),(109,18.414635,-64.615687,'Mooring ball #9','Tynan Buckerfield','30','',1),(110,18.414868,-64.615544,'Mooring ball #10','Tynan Buckerfield','30','\0',1),(111,18.414745,-64.615549,'Mooring ball #11','Tynan Buckerfield','30','\0',1),(112,18.414632,-64.615557,'Mooring ball #12','Tynan Buckerfield','30','\0',1),(201,18.446651,-64.529587,'Mooring balls #1','Arri Golsby','40$','\0',2),(301,18.387113,-64.513346,'Mooring balls #1','Mahmoud Greaser','35$','\0',2),(401,18.446651,-64.529587,'Mooring balls #1','Sigrid Louche','30$','\0',2),(501,18.317804,-64.614617,'Mooring balls #1','Marcelo Gentreau','35$','\0',2);
/*!40000 ALTER TABLE `mooring_ball` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Default applicationUser','USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `applicationUser`
--

LOCK TABLES `applicationUser` WRITE;
/*!40000 ALTER TABLE `applicationUser` DISABLE KEYS */;
INSERT INTO `applicationUser` VALUES (1,'Name','Surname','1234','login');
/*!40000 ALTER TABLE `applicationUser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,1);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;