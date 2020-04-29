using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace C_Sharp
{
   public class StringHas
    {
       
        /// <summary>
        /// 错误判断
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        private bool StringHasF(string str)
        {
            if (str==null&&str=="")
            {
                return false;
            }
            return true;
        }
        /// <summary>
        /// 正确的判断
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        private bool StringHasT(string str)
        {
            return string.IsNullOrEmpty(str);
        }

    }
}