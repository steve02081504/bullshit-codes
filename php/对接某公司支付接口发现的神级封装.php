<?php
/**
 * @author ***(作者名字我还是屏蔽了吧)
 * @date 2016-12-28
 */
 class MD5 {

 	function getMD5ofStr($srcPara) {
 		return md5($srcPara);
 	}

 	function getMD5Upper($srcPara) {
 		if(!$srcPara)
 			return '';
 		return md5($srcPara);
 	}

 	function getMD5Base64($srcPara) {
 		if(!$srcPara)
 			return '';
 		return base64_encode(getMD5Upper($srcPara));
 	}
 }


 