
SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


--
-- Database: `smsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE IF NOT EXISTS `student_info` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `dob` text NOT NULL,
  `fname` text NOT NULL,
  `mname` text NOT NULL,
  `sex` text NOT NULL,
  `nationality` text NOT NULL,
  `religion` text NOT NULL,
  `blood` text NOT NULL,
  `subject` text NOT NULL,
  `admission` text NOT NULL,
  `address` text NOT NULL,
  `studentid` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `student_info`
--
-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `un` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `un`) VALUES
(1, 'tanmay'),
(3, 'sagar');
