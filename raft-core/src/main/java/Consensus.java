import com.gzk.entity.AentryResult;
import com.gzk.entity.RvoteResult;

/*
 * 共识接口
 * 确保达成一致性
 *
 */
public interface Consensus {
    /*
    * 请求投票 RPC
    * 参数:
    * 请求者(candidate)的任期: long term
    * 请求者(candidate)的的id : long candidateId
    * 请求者(candidate)最后一个日志条目下标:long lastLogIndex
    * 请求者(candidate)最后一个日志条目的term :long lastLogTerm
    *
    * 返回:
    * 当前的任期: long term
    * 投票结果: boolean voteGranted
    * */
    RvoteResult requestVote();

    /*
    * 添加日志条目结果 RPC
    * 参数:
    * 领导者(leader)的任期: term
    * 领导者(leader)的ID: leaderId
    *1
    * */
    AentryResult appendEntry();
}
